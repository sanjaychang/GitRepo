package org.spring.batch.samples;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"job-database-xml.xml");
		JobLauncher jobLauncher = (JobLauncher) appCtx.getBean("jobLauncher");
		Job job = (Job) appCtx.getBean("dbToXML");

		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
