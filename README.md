# coursier-zoo-test

Without [coursier](https://github.com/alexarchambault/coursier), the dependencies in this project resolve without issue:

```
$ ./sbt
> update
...
[info] downloading https://repo1.maven.org/maven2/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6-tests.jar ...
[info] 	[SUCCESSFUL ] org.apache.zookeeper#zookeeper;3.4.6!zookeeper.jar(test-jar) (237ms)
...
```

But when I enable [coursier](https://github.com/alexarchambault/coursier), I see the following issue:

```
$ ./sbt
> update
[error] 1 not found
[error]   https://repo1.maven.org/maven2/org/apache/zookeeper/zookeeper/3.4.6/zookeeper-3.4.6.test-jar
[trace] Stack trace suppressed: run last *:update for the full output.
[error] (*:update) java.lang.Exception: Encountered 1 errors (see above messages)
```

This seems to be related to the problem raised in [Issue 298](https://github.com/alexarchambault/coursier/issues/298)
