package adapter.apis;

import adapter.interfaces.IServerApi;

public class ServerApi implements IServerApi {

    @Override
    public String readXml() {
        return "XML data";
    }

    @Override
    public String generateXml(String data) {
        return "Generated XML: " + data;
    }
}
