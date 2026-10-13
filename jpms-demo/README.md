# jpms-demo

A minimal Java Platform Module System example with two modules:

- `car.common` exports `car.common.model`
- `car.shop` requires `car.common`

It is built with plain `javac` so the module mechanics stay visible, and is not
part of the Maven build. Run these from this folder:

```bash
javac -d out/car.common $(find car-common/car.common -name '*.java')
javac --module-path out -d out/car.shop $(find cars/car.shop -name '*.java')
java --module-path out -m car.shop/car.shop.CarService
```
