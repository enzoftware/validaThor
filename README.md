<div align="center">


<img src="https://image.spreadshirtmedia.com/image-server/v1/mp/designs/1014750864,width=178,height=178,version=-1696829958/thor-icon.png" width="160"/>


<h1> ValidaThor </h1>

</div>

[![](https://jitpack.io/v/enzoftware/validaThor.svg)](https://jitpack.io/#enzoftware/validaThor)


## About ValidaThor
Easy android validator library to check if strings match with regex patterns.

## Using ValidaThor :zap: in your Android app

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.enzoftware:validaThor:0.1.0'
	}
```

Step 3. Sync gradle files

Step 4. Create an instance of ValidaThor:
```
private lateinit var validaThor: ValidaThor
```

Step 5. Initialize the instance of ValidateTor by appending the following to onCreate():
```
// Initialize validatetor instance
validathor = ValidaThor()
```

Step 6. Start validating your strings
```
validathor.validateCreditCard(str)
validathor.isEmail(str)
validathor.isJson(str)
validathor.isNumeric(str)
validathor.isBase64(str)
validathor.isAtLeastLength(str, length)
// and more ...
```

## Check the [example](app) app :zap: :smile:

## Find this project useful ? ❤️
Support it by clicking the ⭐️ button on the upper right of this page. ✌️

## Contact - Let's become friend
- [Twitter](https://twitter.com/enzoftware)
- [Github](https://github.com/enzoftware)
- [Medium](https://medium.com/@enzoftware)

## Contributing to ValidaThor :zap:
All pull requests are welcome, make sure to follow the [contribution guidelines](CONTRIBUTING.md) when you submit pull request.

