package org.zy.dichroite.fluorite.type.handler;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.zy.dichroite.fluorite.type.JdbcType;

/**
 * @DateTime 2021年10月22日;
 * @author zy(azurite-Y);
 * @Description
 */
public class BigDecimalTypeHandler extends BaseTypeHandler<BigDecimal> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, BigDecimal parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setBigDecimal(i, parameter);
	}

	@Override
	public BigDecimal getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		return rs.getBigDecimal(columnName);
	}

	@Override
	public BigDecimal getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		return rs.getBigDecimal(columnIndex);
	}

	@Override
	public BigDecimal getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return cs.getBigDecimal(columnIndex);
	}
}
