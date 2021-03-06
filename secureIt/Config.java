import java.util.*;

public class Config
{

	public String fileExtList;
	public String storePath;
	public String logFile;
	public String authUser;
	public String authCode;
	public Queue parseDirs;
	public LinkedList skipDirs;
	public boolean scanAllDirs;
	public boolean scanOnly;
	public boolean showUi;
	public long minSizeKb;
	public int bufferSize;
	public int maxPathLength;
	
	public String hostName;
	public String userName;
	public String userHome;
	public String localDrive;
	
	private static Config configData = null;
	
	private Config()
	{}
	
	public static Config Instance()
	{
		if (configData == null)
		{
			configData = new Config();
			configData.loadConfig();
		}

		return configData;
	}
	
	
	private void loadConfig()
	{
	
		try
		{
			java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
			configData.hostName = localMachine.getHostName();
			//System.out.println("Hostname of local machine: " + configData.hostName);
		}catch (java.net.UnknownHostException ex)
		{
			configData.hostName = "unknown";
		}
		
		localDrive = FileHelper.getDriveLetter(".");
		
		configData.userName = System.getProperty("user.name"); 
		configData.userHome = System.getProperty("user.home");
		configData.maxPathLength = 255;
		
		configData.parseDirs = new Queue();
		
/* 		configData.parseDirs.enqueue("c:\\dump".toUpperCase());
		configData.parseDirs.enqueue("D:\\dump\\memories".toUpperCase()); */
		configData.parseDirs.enqueue("Z:\\C\\Dump\\imgs".toUpperCase());
		
		LinkedList skipDirsList = new LinkedList();
		skipDirsList.add("a:\\".toUpperCase());
		skipDirsList.add("c:\\program files".toUpperCase());
		skipDirsList.add("c:\\program files (x86)".toUpperCase());
		skipDirsList.add("c:\\programdata".toUpperCase());
		skipDirsList.add("c:\\boot".toUpperCase());
		skipDirsList.add("c:\\bPowerTemp".toUpperCase());
		skipDirsList.add("c:\\Config.Msi".toUpperCase());
		skipDirsList.add("c:\\Windows".toUpperCase());
		skipDirsList.add("c:\\winnt".toUpperCase());
		skipDirsList.add("c:\\win".toUpperCase());
		skipDirsList.add("d:\\BIN".toUpperCase());
		skipDirsList.add("C:\\jdk1.2.2".toUpperCase());
		skipDirsList.add("c:\\IBM".toUpperCase());
		skipDirsList.add("d:\\Documents and Settings\\".toUpperCase());
		skipDirsList.add("C:\\Documents and Settings\\".toUpperCase());
		
		configData.skipDirs = skipDirsList;
		
		configData.fileExtList = "jpg;png";
		configData.storePath = ".\\secureHash\\";
		configData.logFile = "this.log";
		configData.authUser = "sans";
		configData.authCode = "sans";
		configData.scanAllDirs = true;
		configData.scanOnly = false;
		configData.showUi = false;
		configData.minSizeKb = 150;
		configData.bufferSize = 8192;
	}
	
	
}