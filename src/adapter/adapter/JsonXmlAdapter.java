package adapter.adapter;

import adapter.interfaces.IClientApi;
import adapter.interfaces.IClientServerAdapter;
import adapter.interfaces.IServerApi;

public class JsonXmlAdapter implements IClientServerAdapter {
    private IClientApi clientApi;
    private IServerApi serverApi;

    public JsonXmlAdapter(IClientApi clientApi, IServerApi serverApi) {
        this.clientApi = clientApi;
        this.serverApi = serverApi;
    }

    @Override
    public String readData() {
        return "Converted to JSON: " + serverApi.readXml();
    }

    @Override
    public String generateData(String data) {
        return "Converted to XML: " + clientApi.generateJson(data);
    }
}
