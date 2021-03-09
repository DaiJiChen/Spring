# IOC Container


##  Concepts

**What is IOC**: Let Spring handle the control of  objects and calls between objects.

**Why use IOC**: Decoupling

**Underlying principles**: `XML Parsing`, `Factory Pattern`, `Reflection`

**IOC Container**: An object factory**.

**Two way to create a IOC container (Two interface)**:

      1. BeanFactory: used by Spring itself, usually not used by developer
        - Don't create object when parsing the XML file, only create object when this object is used.
      2. ApplicationContext: A child interface of BeanFactory, have ore methods, usually used by developer
        - Object is created when parsing the XML file.
   
   
Concrete Class of AllpicationContext interface
      
![ApplicationContext.jpg](/Notes/images/ApplicationContext.jpg)



### 1. Create Object  with XML

use bean tag in xml, add corresponding properties.

      - id: give object an identifier
      - class: full path of the class

Use the constructor that has no parameters by default when creating object

```
      <bean id="user" class="com.sit.jichen.User"></bean>
```

### 2. Property Injection  with XML

DI (Dependency Injection 依赖注入）： 就是 Property Injection （依赖注入）， 就是给class的field赋值

Two way of injection

#### DI use setter() method

```
    public void setBname(String bname) {
        this.bname = bname;
    }
}
```
configure in XML
a. create class
b. Config properties injection in Spring XML Config file

```
    <!-- 配置User对象创建-->
    <bean id="user" class="com.sit.jichen.User"></bean>

    <!--  setter() method property injection  -->

    <!--  1. create oject  -->
    <bean id="book" class="com.sit.jichen.Book">
        <!--  2. use property tag to inject property
            name: filed name
            value: value to be assigned
        -->
        <property name="name" value="The Alchemist"></property>
        <property name="author" value="author1"></property>
    </bean>
 ```
 
 #### 使用p名称空间注入属性

```
    <bean id="book" class="com.sit.jichen.Book" p:name="a" p.author="jichen"></bean>
```

#### Inject `null`

```
<property name = "address">
        <null/>
</property>
```

#### Inject special character

1. use escape characters
```
    <property name="address" value="&lt;&lt;The Alchemist&gt;&gt;"></propert>
```

2. put special value in ![CDATA[   ]]
```
<property name="address">
    <value><![CDATA[<<The Alchemist>>]]></value>
</property>
```
 
#### DI Use Constructor with property for property injection


```
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
```

config in XML

```xml
<!--  constructor() property injection  -->
    <!--  1. create object  -->
    <bean id="orders" class="com.sit.jichen.Orders">
        <constructor-arg name="oname" value="computer"></constructor-arg>
        <constructor-arg name="address" value="China"></constructor-arg>
    </bean>
```

test


#### inject outer bean: use `ref`

```xml
    <!--create UserService object and ConcreteUser object-->
    <bean id="UserService" class="com.sit.jichen.service.UserService">
        <!--inject user object: use 'ref' -->
        <property name="user" ref="ConcreteUser"></property>
    </bean>

    <bean id="ConcreteUser" class="com.sit.jichen.dao.ConcreteUser"></bean>
```

#### Inject inner bean

```xml
    <bean id="employer" class="com.sit.jichen.bean.Employer">
        <property name="name" value="Jichen"></property>
        <property name="gender" value="Female"></property>

        <!--set object property using inner bean-->
        <property name="dept">
            <bean id="Department" class="com.sit.jichen.bean.Department">
                <property name="deptName" value="security department"></property>
            </bean>
        </property>

    </bean>
```


