1)JDBC Java Database Connectivity - Java API to connect to relational
databases
2)DriverManager Manages JDBC drivers and creates database connections
3)ResultSet Table of data returned by executing a SQL query via Statement
4)Servlet Java class handling HTTP requests/responses on a web server
5)Filter Intercepts requests/responses - lifecycle: init() -> doFilter() -> destroy()
6)JSP JavaServer Pages - HTML with embedded Java for dynamic content
generation
9 Implicit Objects request, response, out, session, application, config, pageContext,
page, exception
IoC Inversion of Control - Spring container manages object creation and
wiring
DI Dependency Injection - dependencies provided externally (not
self-created)
Spring Bean Object managed by Spring IoC container throughout its lifecycle
BeanFactory Basic Spring container - lazy loading - lightweight
ApplicationContext Full-featured Spring container - eager loading - supports events, i18n,
AOP
@Component Marks class as Spring-managed bean for auto-detection in component
scan
@Autowired Auto-injects matching bean from Spring container by type
@Controller Spring MVC class that handles web requests
DispatcherServlet Front Controller in Spring MVC - single entry point for all HTTP
requests
ModelAndView Spring MVC object holding model data + logical view name
@RequestMapping Maps URLs/HTTP methods to specific controller handler methods
ORM Object-Relational Mapping - maps Java objects to DB table rows
automatically
JPA Java Persistence API - standard specification for ORM in Java
Hibernate Most popular JPA implementation/ORM framework
EntityManager JPA interface for CRUD on entities: persist, find, merge, remove,
createQuery
EntityManagerFactory Factory that creates EntityManager instances (one per app)
JPQL JPA query language - like SQL but operates on entity classes not
tables
@Entity Marks Java class as JPA entity mapped to a database table
@Id Marks the primary key field of a JPA entity
@NamedQuery Pre-defined static JPQL query annotated on entity - compiled at startup
@OneToMany JPA - one entity has many related entities (e.g. one Dept has many
Employees)
@ManyToMany JPA - many entities relate to many other entities (e.g. Student-Course)
JdbcTemplate Spring class that simplifies JDBC - no more try/catch/finally boilerplate
@Transactional Spring annotation for declarative transaction management
Spring Boot Framework with auto-configuration + embedded server + starter POMs
