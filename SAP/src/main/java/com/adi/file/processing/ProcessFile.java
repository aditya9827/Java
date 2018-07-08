package com.adi.file.processing;

import java.util.List;

import com.adi.model.transaction.Transaction;

public interface ProcessFile {
	public List<Transaction> processFile(String filePath);
}
