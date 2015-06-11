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
            &lt;plugin&gt;
                &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
                &lt;artifactId&gt;maven-release-plugin&lt;/artifactId&gt;
                &lt;version&gt;2.5.2&lt;/version&gt;
                &lt;dependencies&gt;
                    &lt;dependency&gt;
                        &lt;groupId&gt;org.apache.maven.scm&lt;/groupId&gt;
                        &lt;artifactId&gt;maven-scm-provider-gitexe&lt;/artifactId&gt;
                        &lt;version&gt;1.9.4&lt;/version&gt;
                    &lt;/dependency&gt;
                &lt;/dependencies&gt;
            &lt;/plugin&gt;
</pre>

also added some JGit integration code
