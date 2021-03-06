
package com.doublechaintech.retailscm.retailstoreorder;
import com.doublechaintech.retailscm.AccessKey;


public class RetailStoreOrderTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
	public static final String TABLE_NAME="retail_store_order_data";
	static final String COLUMN_ID = "id";
	static final String COLUMN_BUYER = "buyer";
	static final String COLUMN_SELLER = "seller";
	static final String COLUMN_TITLE = "title";
	static final String COLUMN_TOTAL_AMOUNT = "total_amount";
	static final String COLUMN_LAST_UPDATE_TIME = "last_update_time";
	static final String COLUMN_VERSION = "version";
 
	public static final String []ALL_CLOUMNS = {COLUMN_ID,COLUMN_BUYER,COLUMN_SELLER,COLUMN_TITLE,COLUMN_TOTAL_AMOUNT,COLUMN_LAST_UPDATE_TIME,COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {COLUMN_BUYER,COLUMN_SELLER,COLUMN_TITLE,COLUMN_TOTAL_AMOUNT,COLUMN_LAST_UPDATE_TIME};
	
	
}


