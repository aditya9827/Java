package com.adi.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTradeTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).

		// System.out.println(transactions.stream().filter((d) -> d.getYear() ==
		// 2011).sorted().collect(Collectors.toList()));

		// 2. What are all the unique cities where the traders work?

		// System.out.println(transactions.stream().map((t) -> t.getTrader()).map((t) ->
		// t.getCity()).distinct()
		// .collect(Collectors.toList()));

		// 3. Find all traders from Cambridge and sort them by name.

		// System.out.println(transactions.stream().map((t) -> t.getTrader()).filter((t)
		// -> t.getCity().equals("Cambridge"))
		// .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList()));

		// 4. Return a string of all traders’ names sorted alphabetically.

		// System.out.println(transactions.stream().map(Transaction::getTrader).distinct()
		// .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList()));

		// 5. Are any traders based in Milan?
		// System.out.print(
		// transactions.stream().anyMatch(transaction ->
		// transaction.getTrader().getCity().equals("Milan")));

		// 6. Print all transactions’ values from the traders living in Cambridge.

		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue)
				.forEach(System.out::println);
	}

}
