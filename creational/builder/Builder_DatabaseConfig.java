package creational.builder;

/*
  Common use cases of the builder design pattern in web development:
    1. Building Complex Objects
    2. Configuration of Database Connections
    3. HTML Response Generation
*/

public class Builder_DatabaseConfig {
  private final String host;
  private final int port;
  private final String username;
  private final String password;
  private final String databaseName;

  // constructor to be called by the builder
  public Builder_DatabaseConfig(DatabaseConfigBuilder builder) {
    this.host = builder.host;
    this.port = builder.port;
    this.username = builder.username;
    this.password = builder.password;
    this.databaseName = builder.databaseName;
  }

  public String getHost() {
    return host;
  }

  public int getPort() {
    return port;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  @Override
  public String toString() {
    return "DatabaseConfig{" +
        "host='" + host + '\'' +
        ", port=" + port +
        ", username='" + username + '\'' +
        ", databaseName='" + databaseName + '\'' +
        '}';
  }
}
