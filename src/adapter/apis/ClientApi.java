package adapter.apis;

import adapter.interfaces.IClientApi;

public class ClientApi implements IClientApi {
    @Override
    public String readJson() {
        return "JSON data";
    }

    @Override
    public String generateJson(String data) {
        return "Generated JSON: " + data;
    }

}
