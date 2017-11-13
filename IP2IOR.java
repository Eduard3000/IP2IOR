import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Random;

import com.fasterxml.jackson.databind.JsonNode;
import com.maxmind.db.CHMCache;
import com.maxmind.db.InvalidDatabaseException;
import com.maxmind.db.NoCache;
import com.maxmind.db.NodeCache;
import com.maxmind.db.Reader;
import com.maxmind.db.Reader.FileMode;

public class IP2IOR {

	public static void main(String[] args) throws IOException, InvalidDatabaseException {

File database = new File("ior.mmdb");

Reader reader = new Reader(database);

InetAddress address = InetAddress.getByName(args[0]);

JsonNode response = reader.get(address);

System.out.println(response);

reader.close();

}
}
