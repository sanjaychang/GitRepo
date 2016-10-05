package org.spring.batch.samples;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ReportMapper implements RowMapper<Report> {

	public Report mapRow(ResultSet rs, int rowNum) throws SQLException {
		Report report = new Report();
		report.setEmpId(rs.getString("EMP_ID"));
		report.setEmpName(rs.getString("EMP_NAME"));
		report.setDesgination(rs.getString("DESIGNATION"));
		report.setProject(rs.getString("PROJECT"));
		return report;
	}

}
