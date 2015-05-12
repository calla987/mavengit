# Maven - Git

Sanbox git repo with a simple maven project.

Use this project to figure out how the maven git scm integration works.
- mvn release:prepare release:perform
- branching
- commiting
- pushing
- etc etc.


mvn release:prepare tags and pushes the changes

mvn release:rollback only performs the pom update tags are not removed

The final tag/release code contains version -SNAPSHOT.

Upgrade release and scm-provider to fix the -SNAPSHOT issue.

<pre>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-release-plugin</artifactId>
                <version>2.5.2</version>
                <dependencies>
                    <dependency>
                        <groupId>org.apache.maven.scm</groupId>
                        <artifactId>maven-scm-provider-gitexe</artifactId>
                        <version>1.9.4</version>
                    </dependency>
                </dependencies>
            </plugin>
</pre>