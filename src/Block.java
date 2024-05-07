import java.util.Date;

public class Block 
{
    public String hash;
    public String previousHash;
    private String data; // Main data is stored

    private long timestamp; 
    
    public Block(String data, String previousHash)
    {
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
    }
}
