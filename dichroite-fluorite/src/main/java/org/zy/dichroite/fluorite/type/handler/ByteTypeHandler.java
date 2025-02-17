package org.zy.dichroite.fluorite.type.handler;

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
public class ByteTypeHandler extends BaseTypeHandler<Byte> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Byte parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setByte(i, parameter);
	}

	@Override
	public Byte getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		return rs.getByte(columnName);
	}

	@Override
	public Byte getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		return rs.getByte(columnIndex);
	}

	@Override
	public Byte getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return cs.getByte(columnIndex);
	}
}