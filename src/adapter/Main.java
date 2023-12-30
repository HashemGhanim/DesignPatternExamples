package adapter;

import adapter.adapter.JsonXmlAdapter;
import adapter.apis.ClientApi;
import adapter.apis.ServerApi;
import adapter.interfaces.IClientApi;
import adapter.interfaces.IClientServerAdapter;
import adapter.interfaces.IServerApi;

public class Main {
    public static void main(String[] args) {
        IClientApi clientApi = new ClientApi();
        IServerApi serverApi = new ServerApi();

        IClientServerAdapter adapter = new JsonXmlAdapter(clientApi , serverApi);

        System.out.println(adapter.readData());
        System.out.println(adapter.generateData("Sample Data"));
    }
}
