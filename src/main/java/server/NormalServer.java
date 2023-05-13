package server;

/**
 * @Auther: chengjiahui
 * @Date: 2023/5/13
 * @Description:
 */
public class NormalServer extends Server{

    public NormalServer(String hostname,int port){
        this.hostName=hostname;
        this.port=port;
    }

    @Override
    public void start() throws Exception {

    }
}
