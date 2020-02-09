# junit-jupiter-typed-params
Create typed parameters with JUnit Jupiter Params

## Usage

```java
static Stream<TypedArguments2<Integer, Boolean>> arguments() {
    return Stream.of(
        TypedArguments.create(17, false),
        TypedArguments.create(22, true)
    );
}

@ParameterizedTest
@MethodSource("arguments")
void personIsAdultWithArguments(final int age, final boolean isAdult) {
    assertThat(new Person(age).isAdult()).isEqualTo(isAdult);
}
```

## Gradle Dependencies

```
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}

dependencies {
    testCompile 'com.github.goerge:junit-jupiter-typed-params:1.0.0'
}
```
[![Release](https://jitpack.io/v/goerge/junit-jupiter-typed-params.svg?style=flat-square)](https://jitpack.io/#goerge/junit-jupiter-typed-params)
