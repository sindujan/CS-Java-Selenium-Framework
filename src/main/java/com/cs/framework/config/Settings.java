package com.cs.framework.config;

import com.cs.framework.utilities.LogUtil;
import com.cs.framework.base.BrowserType;

import java.sql.Connection;

public class Settings
{
   //For Application Backend
    public static Connection AUTConnection;
    //For EARS Reporting
    public static Connection ReportingConnection;
    //For Application backend connection string
    public static String AUTConnectionString;
    public static String ReportingConnectionString;
    //Log Path for framework
    public static String LogPath;
    //Driver Type for SQL Server connectivity
    public static String DriverType;
    public static String ExcelSheetPath;
    public static String SheetName;
    public static String AUT;
    public static  BrowserType BrowserType;
    public static LogUtil Logs;
    public static String SeleniumGridHub;
    public static String HistoricalReport;

}
