package org.zy.dichroite.fluorite.type.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import org.zy.dichroite.fluorite.type.JdbcType;

/**
 * @DateTime 2021年10月22日;
 * @author zy(azurite-Y);
 * @Description
 */
public class DateTypeHandler extends BaseTypeHandler<Date> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setTimestamp(i, new Timestamp((parameter).getTime()));
	}

	@Override
	public Date getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		Timestamp sqlTimestamp = rs.getTimestamp(columnName);
		if (sqlTimestamp != null) {
			return new Date(sqlTimestamp.getTime());
		}
		return null;
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		Timestamp sqlTimestamp = rs.getTimestamp(columnIndex);
		if (sqlTimestamp != null) {
			return new Date(sqlTimestamp.getTime());
		}
		return null;
	}

	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		Timestamp sqlTimestamp = cs.getTimestamp(columnIndex);
		if (sqlTimestamp != null) {
			return new Date(sqlTimestamp.getTime());
		}
		return null;
	}
}
