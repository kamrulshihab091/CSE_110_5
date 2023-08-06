public class Client extends Identity {

    private String address;
    private String contacts;
    private int clientId;

    public String getAddress() {
        return address;
    }

    public int getClientId() {
        return clientId;
    }

    public String getContacts() {
        return contacts;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public void create() {
    }

    public void update() {
    }

}