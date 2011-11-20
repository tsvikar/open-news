package org.openews.data;

import java.io.Serializable;
import java.util.List;

public interface Journal extends Serializable
{
	public String getName();
	public User getPublisher();
	public User getEditorInChief();
	public List<User> getCoEditors();
	public long getCreationTime();
}
