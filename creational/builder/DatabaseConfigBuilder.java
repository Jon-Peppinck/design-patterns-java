package creational.builder;

public class DatabaseConfigBuilder {
  String host;
  int port;
  String username;
  String password;
  String databaseName;

  public DatabaseConfigBuilder setHost(String host) {
    this.host = host;
    return this;
  }

  public DatabaseConfigBuilder setPort(int port) {
    this.port = port;
    return this;
  }

  public DatabaseConfigBuilder setUsername(String username) {
    this.username = username;
    return this;
  }

  public DatabaseConfigBuilder setPassword(String password) {
    this.password = password;
    return this;
  }

  public DatabaseConfigBuilder setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  public Builder_DatabaseConfig build() {
    return new Builder_DatabaseConfig(this); // Call the constructor with this builder
  }
}
