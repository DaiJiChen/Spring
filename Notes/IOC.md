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
      3. Concrete Class if AllpicationContext
      
![ApplicationContext.jpg](/Notes/images/ApplicationContext.jpg)
