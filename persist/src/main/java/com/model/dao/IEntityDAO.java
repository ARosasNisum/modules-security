package com.model.dao;

import com.model.domain.Entity;

import java.util.List;

/**
 * 
 * Entity DAO Interface
 * 
 * @author
 * @version 1.0.0
 *
 */
public interface IEntityDAO {
	public void addEntity(Entity entity);

	public void updateEntity(Entity entity);
	
	public void deleteEntity(Entity entity);
	
	public Entity getEntity(int id);

	public List<Entity> getEntities();
}
