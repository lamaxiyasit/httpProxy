package server;

import server.userServices.UserServicesList;
import util.FileTable;

/**
 * @Auther: chengjiahui
 * @Date: 2023/5/13
 * @Description:
 */
public abstract class Server {

    protected boolean isNormal=true;

    protected String hostName;

    protected int port;

    public static UserServicesList userServicesList;

    public static FileTable fileTable;

    abstract public void start() throws Exception;

}
