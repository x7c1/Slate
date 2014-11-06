#Slate

Giter8 templates to create sbt multi-layered project

##Usage

Make a `sample` directory for example.

```
mkdir sample
cd ./sample
git clone https://github.com/x7c1/Slate.git
```

Here are the directories for now.

* /sample
  * /Slate (git cloned)

Call g8 and input some project information.

```
g8 file://Slate/slate-template/

organization [org.example]: beerlover         
name [Slate Application]: Beer Apps       
app_prefix [slate]: malt

Template applied in ./beer-apps
```

Then you can find generated project files.

```
find ./beer-apps -type f
./beer-apps/.gitignore
./beer-apps/malt-app/src/main/scala/beerlover/malt/app/BeerApps.scala
./beer-apps/malt-lib/src/main/scala/beerlover/malt/lib/MaltLibrary.scala
./beer-apps/malt-lib/src/test/scala/beerlover/malt/lib/MaltLibraryTest.scala
./beer-apps/project/MaltBuild.scala
```

Generated test can be passed correctly.

```
cd beer-apps
sbt malt-lib/test
...
[info] MaltLibrary$ should
[info] + create message
[info] 
[info] Total for specification MaltLibraryTest
[info] Finished in 17 ms
[info] 1 example, 0 failure, 0 error
[info] Passed: Total 1, Failed 0, Errors 0, Passed 1
[success] Total time: 7 s, completed 2014/11/03 19:36:49
```

Host layer's application using this also works fine.

```
sbt malt-app/run
...
hello, BeerApps!
[success] Total time: 5 s, completed 2014/11/03 19:40:20
```

### To add another sub-project

Use `slate-template-sub` in `sample` directory.

```
g8 file://Slate/slate-template-sub/
Create sub-project for sbt

organization [org.example]: beerlover
name [Slate Application]: Beer Apps
sub_project [sub]: stout
app_prefix [slate]: malt

Template applied in ./beer-apps
```

Files are created similarly (except for build definitions)

```
find ./beer-apps/malt-stout -type f
./beer-apps/malt-stout/src/main/scala/beerlover/malt/stout/MaltStout.scala
./beer-apps/malt-stout/src/test/scala/beerlover/malt/stout/MaltStoutTest.scala
```

