package org.zy.dichroite.fluorite.type.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.zy.dichroite.fluorite.type.JdbcType;
import org.zy.fluorite.core.utils.ByteArrayUtils;

/**
 * @DateTime 2021年10月22日;
 * @author zy(azurite-Y);
 * @Description
 */
public class ByteObjectArrayTypeHandler extends BaseTypeHandler<Byte[]> {

	  @Override
	  public void setNonNullParameter(PreparedStatement ps, int i, Byte[] parameter, JdbcType jdbcType) throws SQLException {
	    ps.setBytes(i, ByteArrayUtils.convertToPrimitiveArray(parameter));
	  }

	  @Override
	  public Byte[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
	    byte[] bytes = rs.getBytes(columnName);
	    return getBytes(bytes);
	  }

	  @Override
	  public Byte[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
	    byte[] bytes = rs.getBytes(columnIndex);
	    return getBytes(bytes);
	  }

	  @Override
	  public Byte[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
	    byte[] bytes = cs.getBytes(columnIndex);
	    return getBytes(bytes);
	  }

	  private Byte[] getBytes(byte[] bytes) {
	    Byte[] returnValue = null;
	    if (bytes != null) {
	      returnValue = ByteArrayUtils.convertToObjectArray(bytes);
	    }
	    return returnValue;
	  }

	}
