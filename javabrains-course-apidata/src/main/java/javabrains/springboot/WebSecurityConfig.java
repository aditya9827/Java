package javabrains.springboot;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public DataSource dataSource;

	@Override
	protected void configure(HttpSecurity httpSecurity) {
		try {
			/*
			 * Here, we need to authenticate each httprequest and authentication is done
			 * using default login page and using httpbasic security
			 */
			// httpSecurity.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();

			/*
			 * Here, we are permitting requests who matches with (/topics) with
			 * Authentication.All other requests need to authenticate using form login.
			 */
			httpSecurity.authorizeRequests().antMatchers("/topics").permitAll().anyRequest().authenticated().and()
					.formLogin().and().requiresChannel().antMatchers("/topics/").requiresSecure();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		try {
			auth.inMemoryAuthentication().withUser("adi").password("adi123").roles("USER");
			/*
			 * Use below approach when fetching creditionals from Database.However, in below
			 * spring security is firing default queries to fetch data from default table
			 * like User. In case of custom table, need to change the queries.
			 * 
			 */
			// if (null != dataSource) {
			// auth.jdbcAuthentication().dataSource(dataSource);
			// }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
