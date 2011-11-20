package org.openews.data;

import java.io.Serializable;
import java.util.List;

public interface Item extends Serializable
{
	public String getTitle();
	public String getContent();
	public User getAuthor();
	public Item getParent();
	public List<Item> getChildren();
	public long getCreationTime();
	public long getUpdateTime();
	public String exclusiveTo();
}
