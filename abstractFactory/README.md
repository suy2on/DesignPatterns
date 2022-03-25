## Abstract Factory

</br></br>

### 개념설명 

![](https://gmlwjd9405.github.io/images/design-pattern-abstract-factory/abstract-factory-pattern.png)

- AbstractFactor  :실제 팩토리 클래스의 공통 인터페이스
- ConcreteFactory : 구체적인 팩토리 클래스로 AbstractFactory 클래스의 추상 메서드를 오버라이드함으로써 구체적인 제품을 생성한다.
- AbstractProduct : 제품의 공통 인터페이스 
- ConcreteProduct : 구체적인 팩토리 클래스에서 생성되는 구체적인 제품

> 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.

</br></br>

### 활용방안
- 프로그램에 새 제품이나 제품군을 자주 추가하게 되는데 핵심코드들을 변경하고 싶지 않음
- 여러 종류의 객체군이 있음

</br>
</br></br>


### 예제코드

#### 1. 구조 

![](https://refactoring.guru/images/patterns/diagrams/abstract-factory/example-2x.png)
```zsh
└── abstractFactory
    ├── App.java
    ├── Main.java
    ├── buttons
    │   ├── Button.java
    │   ├── MacButton.java
    │   └── WinButton.java
    ├── checkouts
    │   ├── Checkout.java
    │   ├── MacCheckout.java
    │   └── WinCheckout.java
    └── factories
        ├── GUIFactory.java
        ├── MacOSFactory.java
        └── WinOSFactory.java
  
```

</br></br></br>


참고
- https://refactoring.guru/design-patterns/abstract-factory