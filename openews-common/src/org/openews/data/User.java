package org.openews.data;

import java.io.Serializable;

public interface User extends Serializable
{
	public String getGivenName();
	public String getFamilyName();
	public long getId();
}
