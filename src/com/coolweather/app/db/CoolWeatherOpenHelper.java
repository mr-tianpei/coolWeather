package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * Province建表语句
	 */
public static final String CREATE_PROVINCE = "create table Province("
		+"id integer primary key autoincrement,"
		+"province_name text,"
		+"provinSce_code text)";
	/**
		 * City建表语句
		 */
	public static final String CREATE_CITY = "create table City("
			+"id integer primary key autoincrement,"
			+"city_name text,"
			+"city_code text," 
			+"province_id interge)";
	/**
	 * Province建表语句
	 */
public static final String CREATE_COUNTY = "create table County("
		+"id integer primary key autoincrement,"
		+"county_name text,"
		+"county_code text" 
		+"city_id interge)";
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);//创建Province表
		db.execSQL(CREATE_PROVINCE);//创建City表
		db.execSQL(CREATE_PROVINCE);//创建County表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}
