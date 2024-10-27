import behavioral.chainofresponsibility.AuthenticationHandler;
import behavioral.chainofresponsibility.ChainOfResponsibility_requestHandler;
import behavioral.chainofresponsibility.ExampleRequest;
import behavioral.chainofresponsibility.LoggingHandler;
import behavioral.chainofresponsibility.ValidationHandler;
import behavioral.command.AddItemCommand;
import behavioral.command.CartManager;
import behavioral.command.Command_cart;
import behavioral.command.RemoveItemCommand;
import behavioral.command.ShoppingCart;
import behavioral.interpreter.IExpression;
import behavioral.interpreter.Interpreter_queryParser;
import behavioral.iterator.Iterator_product;
import behavioral.iterator.Product;
import behavioral.iterator.ProductCollection;
import behavioral.mediator.ChatRoom;
import behavioral.mediator.ChatUser;
import behavioral.mediator.ConcreteChatUser;
import behavioral.mediator.Mediator_chat;
import behavioral.memento.TextEditor;
import behavioral.memento.TextEditorHistory;
import behavioral.observer.Observer_subscriber;
import behavioral.observer.YouTubeChannel;
import behavioral.state.TheDocument;
import behavioral.strategy.CreditCardPayment;
import behavioral.strategy.CryptoPayment;
import behavioral.strategy.PayPalPayment;
import behavioral.strategy.ShoppingCart2;
import behavioral.strategy.Strategy_payment;
import behavioral.templatemethod.CsvDataProcessor;
import behavioral.templatemethod.JsonDataProcessor;
import behavioral.templatemethod.TemplateMethod_dataProcessor;
import behavioral.visitor.ReportGenerator;
import behavioral.visitor.SalesRecord;
import behavioral.visitor.SystemMetric;
import behavioral.visitor.UserActivity;

import creational.abstractfactory.AbstractFactory_auth;
import creational.abstractfactory.IAuthenticator;
import creational.abstractfactory.OAuthAuthFactory;
import creational.abstractfactory.UsernamePasswordAuthFactory;
import creational.builder.Builder_DatabaseConfig;
import creational.builder.DatabaseConfigBuilder;
import creational.factorymethod.FactoryMethod_validator;
import creational.factorymethod.IValidator;
import creational.prototype.Book;
import creational.singleton.Singleton_simpleCache;

import structural.adapter.Adapter_logger;
import structural.adapter.ICustomLogger;
import structural.adapter.ThirdPartyLogger;
import structural.bridge.BusinessLogic;
import structural.bridge.Bridge_DataBase;
import structural.bridge.MySqlDataBase;
import structural.bridge.PostGresDataBase;
import structural.bridge.ProductManagement;
import structural.bridge.UserManagement;
import structural.composite.Composite_role;
import structural.composite.Permission;
import structural.decorator.Decorator_authController;
import structural.decorator.IController;
import structural.decorator.RealController;
import structural.facade.Facade_apiGateway;
import structural.flyweight.ISessionFlyweight;
import structural.flyweight.UserSessionManager;
import structural.proxy.IImage;
import structural.proxy.Proxy_image;

public class Main {
        public static void main(String[] args) {
                // CREATIONAL
                System.out.println("CREATIONAL");
                System.out.println();

                // SINGLETON
                System.out.println("SINGLETON");
                System.out.println();

                Singleton_simpleCache cache = Singleton_simpleCache.getInstance();
                Singleton_simpleCache cache2 = Singleton_simpleCache.getInstance();
                cache.put("user1", "Alice");
                cache2.put("user2", "Bob");
                System.out.println("Retrieved user1: " + cache.get("user1"));
                System.out.println("Retrieved user2: " + cache.get("user2"));
                cache.remove("user1");
                System.out.println("Retrieved user1 after removal: " + cache.get("user1"));

                // FACTORY METHOD
                System.out.println("FACTORY METHOD");
                System.out.println();

                IValidator emailValidator = FactoryMethod_validator.createValidator("email");
                boolean isEmailValid = emailValidator.validate("test@example.com");
                System.out.println("Email valid: " + isEmailValid);

                IValidator passwordValidator = FactoryMethod_validator.createValidator("password");
                boolean isPasswordValid = passwordValidator.validate("myPass123");
                System.out.println("Password valid: " + isPasswordValid);

                // ABSTRACT FACTORY
                System.out.println("ABSTRACT FACTORY");
                System.out.println();

                // Username/Password Authentication
                AbstractFactory_auth usernamePasswordAuthFactory = new UsernamePasswordAuthFactory();
                IAuthenticator usernamePasswordAuthenticator = usernamePasswordAuthFactory.createAuthenticator();
                boolean isUsernamePasswordAuthenticated = usernamePasswordAuthenticator.authenticate("admin",
                                "password123");
                System.out.println("Username/Password Authenticated: " +
                                isUsernamePasswordAuthenticated);

                // OAuth Authentication
                AbstractFactory_auth oauthAuthFactory = new OAuthAuthFactory();
                IAuthenticator oauthAuthenticator = oauthAuthFactory.createAuthenticator();
                boolean isOAuthAuthenticated = oauthAuthenticator.authenticate("valid_token");
                System.out.println("OAuth Authenticated: " + isOAuthAuthenticated);

                // BUILDER
                System.out.println("BUILDER");
                System.out.println();

                Builder_DatabaseConfig dbConfig = new DatabaseConfigBuilder()
                                .setHost("localhost")
                                .setPort(5432)
                                .setUsername("admin")
                                .setPassword("password123")
                                .setDatabaseName("mydatabase")
                                .build();

                System.out.println(dbConfig);

                // PROTOTYPE
                System.out.println("PROTOTYPE");
                System.out.println();

                Book originalBook = new Book("1984", "George Orwell", 328);
                Book clonedBook = (Book) originalBook.clone();
                System.out.println("Original Book: " + originalBook);
                System.out.println("Cloned Book: " + clonedBook);
                // Verify that they are separate objects
                System.out.println("Are both books the same object? " + (originalBook == clonedBook));

                // STRUCTURAL
                System.out.println("STRUCTURAL");
                System.out.println();

                // ADAPTER
                System.out.println("ADAPTER");
                System.out.println();

                ThirdPartyLogger thirdPartyLogger = new ThirdPartyLogger();
                ICustomLogger logger = new Adapter_logger(thirdPartyLogger);
                logger.logInfo("This is an info message.");
                logger.logError("This is an error message.");

                // DECORATOR
                System.out.println();
                System.out.println("DECORATOR");
                System.out.println();

                // Real controller that handles requests
                IController realController = new RealController();
                // Decorated controller that adds authentication
                IController authController = new Decorator_authController(realController);
                // Case 1: Admin user (Authenticated)
                System.out.println("Request 1: Admin");
                authController.handleRequest("ADMIN");
                // Case 2: Non-admin user (Not Authenticated)
                System.out.println("\nRequest 2: Guest");
                authController.handleRequest("GUEST");

                // FACADE
                System.out.println();
                System.out.println("FACADE");
                System.out.println();

                Facade_apiGateway apiGateway = new Facade_apiGateway();
                // Client interacts only with the facade, not the individual services
                String fullDetails = apiGateway.getFullDetails(1, 101, 1001);
                System.out.println(fullDetails);

                // COMPOSITE
                System.out.println();
                System.out.println("COMPOSITE");
                System.out.println();

                // Create individual permissions
                Permission editUser = new Permission("Edit User");
                Permission viewReports = new Permission("View Reports");
                Permission approveRequests = new Permission("Approve Requests");
                // Create a role for Manager with multiple permissions
                Composite_role managerRole = new Composite_role("Manager");
                managerRole.add(editUser);
                managerRole.add(viewReports);
                managerRole.add(approveRequests);
                // Create a sub-role for Team Lead with a subset of permissions
                Composite_role teamLeadRole = new Composite_role("Team Lead");
                teamLeadRole.add(viewReports);
                teamLeadRole.add(approveRequests);
                // Add team lead role to the manager role
                managerRole.add(teamLeadRole);
                // Check if roles have specific permissions
                System.out.println("Manager has 'Edit User' permission: " + managerRole.checkPermission("Edit User"));
                System.out.println(
                                "Team Lead has 'Edit User' permission: " + teamLeadRole.checkPermission("Edit User"));
                System.out
                                .println("Team Lead has 'Approve Requests' permission: "
                                                + teamLeadRole.checkPermission("Approve Requests"));

                // PROXY
                System.out.println();
                System.out.println("PROXY");
                System.out.println();

                IImage image1 = new Proxy_image("image1.jpg");
                IImage image2 = new Proxy_image("image2.jpg");
                // Image will be loaded and displayed on first request
                image1.display();
                System.out.println();
                // Image will be displayed directly without loading again
                image1.display();
                System.out.println();
                // Another image is loaded and displayed
                image2.display();

                // BRIDGE
                System.out.println();
                System.out.println("BRIDGE");
                System.out.println();

                Bridge_DataBase mySQLDatabase = new MySqlDataBase();
                Bridge_DataBase postgreSQLDatabase = new PostGresDataBase();
                BusinessLogic userManagement = new UserManagement(mySQLDatabase);
                userManagement.performOperation("SELECT * FROM users;");
                BusinessLogic productManagement = new ProductManagement(postgreSQLDatabase);
                productManagement.performOperation("SELECT * FROM products;");

                // FLYWEIGHT
                System.out.println();
                System.out.println("FLYWEIGHT");
                System.out.println();

                UserSessionManager sessionManager = new UserSessionManager();
                // Create sessions with shared common data
                ISessionFlyweight userSession1 = sessionManager.getSession("UserCommonData");
                sessionManager.setUserRole(userSession1, "Admin");
                ISessionFlyweight userSession2 = sessionManager.getSession("UserCommonData");
                sessionManager.setUserRole(userSession2, "Editor");
                ISessionFlyweight userSession3 = sessionManager.getSession("AnotherUserCommonData");
                sessionManager.setUserRole(userSession3, "Viewer");
                // Display the user roles and common data
                System.out.println("Session 1 Role: " + sessionManager.getUserRole(userSession1) + ", Common Data: "
                                + userSession1.getCommonData());
                System.out.println("Session 2 Role: " + sessionManager.getUserRole(userSession2) + ", Common Data: "
                                + userSession2.getCommonData());
                System.out.println("Session 3 Role: " + sessionManager.getUserRole(userSession3) + ", Common Data: "
                                + userSession3.getCommonData());
                // Demonstrating that userSession1 and userSession2 share the same common data
                System.out.println("Session 1 and 2 share common data: "
                                + (userSession1.getCommonData().equals(userSession2.getCommonData())));

                // BEHAVIORAL
                System.out.println("BEHAVIORAL");
                System.out.println();

                // OBSERVER
                System.out.println("OBSERVER");
                System.out.println();

                YouTubeChannel techChannel = new YouTubeChannel();

                Observer_subscriber john = new Observer_subscriber("John");
                Observer_subscriber emma = new Observer_subscriber("Emma");

                techChannel.subscribe(john);
                techChannel.subscribe(emma);

                techChannel.uploadVideo("Observer Pattern Explained!");

                // COMMAND
                System.out.println();
                System.out.println("COMMAND");
                System.out.println();

                ShoppingCart cart = new ShoppingCart();
                CartManager cartManager = new CartManager();

                Command_cart addItem1 = new AddItemCommand(cart, "Laptop");
                Command_cart addItem2 = new AddItemCommand(cart, "Phone");
                Command_cart removeItem = new RemoveItemCommand(cart, "Laptop");

                cartManager.executeCommand(addItem1);
                cartManager.executeCommand(addItem2);
                cart.showCart();

                cartManager.undoLastCommand(); // Undo adding "Phone"
                cart.showCart();

                cartManager.executeCommand(removeItem);
                cart.showCart();

                cartManager.undoLastCommand(); // Undo removing "Laptop"
                cart.showCart();

                // STRATEGY
                System.out.println();
                System.out.println("STRATEGY");
                System.out.println();

                ShoppingCart2 cart2 = new ShoppingCart2();

                // Choosing Credit Card Payment
                Strategy_payment creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
                cart2.setPaymentStrategy(creditCard);
                cart2.checkout(100);
                // Choosing PayPal Payment
                Strategy_payment paypal = new PayPalPayment("john.doe@example.com");
                cart2.setPaymentStrategy(paypal);
                cart2.checkout(150);
                // Choosing Cryptocurrency Payment
                Strategy_payment crypto = new CryptoPayment("1A2B3C4D5E6F");
                cart2.setPaymentStrategy(crypto);
                cart2.checkout(200);

                // CHAIN OF RESPONSIBILITY
                System.out.println();
                System.out.println("CHAIN OF RESPONSIBILITY");
                System.out.println();

                ChainOfResponsibility_requestHandler handler = new AuthenticationHandler(
                                new LoggingHandler(
                                                new ValidationHandler(null)));

                // Create requests
                ExampleRequest validRequest = new ExampleRequest("Valid data", true, true);
                ExampleRequest invalidAuthRequest = new ExampleRequest("Invalid auth data", false, true);
                ExampleRequest invalidDataRequest = new ExampleRequest("Invalid data", true, false);
                // Handle requests
                System.out.println("Handling valid request:");
                handler.handle(validRequest);
                System.out.println("\nHandling request with failed authentication:");
                handler.handle(invalidAuthRequest);
                System.out.println("\nHandling request with failed validation:");
                handler.handle(invalidDataRequest);

                // TEMPLATE METHOD
                System.out.println();
                System.out.println("TEMPLATE METHOD");
                System.out.println();

                TemplateMethod_dataProcessor csvProcessor = new CsvDataProcessor();
                System.out.println("Processing CSV data:");
                csvProcessor.process();

                System.out.println("\nProcessing JSON data:");
                TemplateMethod_dataProcessor jsonProcessor = new JsonDataProcessor();
                jsonProcessor.process();

                // MEDIATOR
                System.out.println();
                System.out.println("MEDIATOR");
                System.out.println();

                Mediator_chat chatRoom = new ChatRoom();

                ChatUser user1 = new ConcreteChatUser(chatRoom, "Alice");
                ChatUser user2 = new ConcreteChatUser(chatRoom, "Bob");
                ChatUser user3 = new ConcreteChatUser(chatRoom, "Charlie");

                chatRoom.addUser(user1);
                chatRoom.addUser(user2);
                chatRoom.addUser(user3);

                user1.send("Hello, everyone!");
                user2.send("Hi Alice!");
                user3.send("Hey there!");

                // STATE
                System.out.println();
                System.out.println("STATE");
                System.out.println();

                TheDocument document = new TheDocument();

                document.edit();
                document.review();
                document.edit();
                document.publish();
                document.edit();

                // ITERATOR
                System.out.println();
                System.out.println("ITERATOR");
                System.out.println();

                ProductCollection productCollection = new ProductCollection();
                productCollection.addProduct(new Product("Laptop"));
                productCollection.addProduct(new Product("Smartphone"));
                productCollection.addProduct(new Product("Tablet"));
                productCollection.addProduct(new Product("Smartwatch"));
                // Simulating pagination with the iterator
                Iterator_product iterator = productCollection.iterator();
                while (iterator.hasNext()) {
                        Product product = iterator.next();
                        System.out.println("Product: " + product.getName());
                }

                // VISITOR
                System.out.println();
                System.out.println("VISITOR");
                System.out.println();

                UserActivity userActivity = new UserActivity(150);
                SalesRecord salesRecord = new SalesRecord(12500.50);
                SystemMetric systemMetric = new SystemMetric(75.3);
                ReportGenerator reportGenerator = new ReportGenerator();
                // Generate reports for each data source
                userActivity.accept(reportGenerator);
                salesRecord.accept(reportGenerator);
                systemMetric.accept(reportGenerator);

                // MEMENTO
                System.out.println();
                System.out.println("MEMENTO");
                System.out.println();

                TextEditor textEditor = new TextEditor();
                TextEditorHistory history = new TextEditorHistory();

                textEditor.addText("Hello, ");
                history.save(textEditor);
                textEditor.addText("World!");
                history.save(textEditor);
                System.out.println("Current Content: " + textEditor.getContent());
                history.undo(textEditor);
                System.out.println("After Undo: " + textEditor.getContent());
                history.undo(textEditor);
                System.out.println("After Undo: " + textEditor.getContent());
                history.redo(textEditor);
                System.out.println("After Redo: " + textEditor.getContent());
                history.redo(textEditor);
                System.out.println("After Redo: " + textEditor.getContent());

                // INTERPRETER
                System.out.println();
                System.out.println("INTERPRETER");
                System.out.println();

                String query = "3 + 5 - 2";
                Interpreter_queryParser parser = new Interpreter_queryParser(query);
                IExpression expression = parser.parse();
                // Execute the query
                int result = expression.interpret();
                System.out.println("Result of query '" + query + "': " + result);
        }
}