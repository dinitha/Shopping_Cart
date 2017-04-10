package com.mywork.dao;

import com.mywork.model.AvailableItems;

import java.util.List;

/**
 * Created by D on 3/25/2017.
 */
public interface AvailableItemsDao {

public void saveOrUpdateItem(AvailableItems availableItems);

public void deleteItem(int itemId);

public AvailableItems getItem(int itemId);

public List<AvailableItems> viewItems();

}
