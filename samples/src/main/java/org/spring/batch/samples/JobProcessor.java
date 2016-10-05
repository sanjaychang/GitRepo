package org.spring.batch.samples;

import org.springframework.batch.item.ItemProcessor;

public class JobProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {
		System.out.println("Processing..." + item);
		return item;
	}
}
