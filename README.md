# Test GTL Automation With Katalon Studio

GTL Automation Test is build using Groovy, Java, Gerking and Katalon Studio. :t-rex:

## How To Run Automation Scripts

First of all make sure you already install **Katalon Studio** on your local computer, please refer this [link](https://www.katalon.com/katalon-studio/) for more information.

when Katalon Studio is installed, the next step is clone this repo by run this command on your local terminal : 

```sh
git clone https://github.com/yuslifarsani/test_GTL.git
```
**!!IMPORTANT!!**  :man_technologist:

**Before** you run the scripts please ask Automation Team for setting up the **Environments Variable**. When all set, run this command on your terminal : 

```sh
./katalonc -noSplash -runMode=console -projectPath="/Users/<<<YOU COMPUTER USER>>>/Katalon Studio/Test_GTL/TEST_GTL.prj" -retry=0 -testSuitePath="Test Suites/TESTSUITE_GTL" -browserType="Web Service" -executionProfile="default" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true
```

or you can run the scripts through GUI of Katalon Studio. :otter:

**Cheers** :chocolate_bar: :croissant: