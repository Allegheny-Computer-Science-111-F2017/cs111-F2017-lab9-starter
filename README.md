<!---

TASK LIST:

  * Use cp -rf *.* to copy all of the files and directories in this repository
    to the starter repository for this assignment
  * Change into the directory for the starer repository
  * Update the header (e.g., #) to only give the name of the assignment
  * Update the first paragraph to include the commented-out content
  * Change the link in the # Problems section to point to this lab's starter
  * Create the assignment in the GitHub Classroom, noting the URL
  * Test the assignment by accepting it with your own GitHub account
  * Check to ensure that your GitHub repository is created correctly
  * Share the assignment link with all of the students using email or Slack

PROBLEMS?

  * Contact Gregory M. Kapfhammer by email or Slack
  * Raise an issue in the GitHub repository for this assignment

-->

# cs111-F2017-lab9-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter for Laboratory 9 in Computer Science 111. Since
the Travis builds for this repository will initially fail (as evidenced by a
red &#x2717; appearing in the commit logs instead of a green &#x2714;), the
programmer is responsible for completing all of the steps needed to satisfy the
requirements for the assignment, thus causing a &#x2714; to instead appear in
the commit logs.

## Introduction

This assignment requires programmers to test and improve a Java program, called
`TodoListManager`, that will produce textual output demonstrating the complete
management a list of tasks that must be finished. First, the program will
display a welcome message and ask the program what step it should perform. Then,
it will accept commands from the user and repeatedly perform the requested
operations. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`TodoListManager.java`, `TodoListItem.java`, and `TodoList.java` files must
adhere to all of the requirements in the [Google Java Style
Guide](https://google.github.io/styleguide/javaguide.html).

The programmers are also responsible for writing a three-paragraph reflection,
stored in the file `writing/reflection.md`, that explains the challenges that
they faced and the solutions they developed and their strategy for calculating
the numerical values. This is a Markdown file that must adhere to the standards
described in the [Markdown Syntax
Guide](https://guides.github.com/features/mastering-markdown/). Remember, you
can preview the contents of a comitted Markdown file by clicking on the name of
the file in your GitHub repository. Finally, don't forget that your
`writing/reflection.md` file should adhere to the Markdown standards established
by the [Markdown linting tool](https://github.com/markdownlint/markdownlint) and
the writing standards set by the [Proselint tool](http://proselint.com/). For
this laboratory assignment, the team members should jointly write the first
paragraph. Then, each team member should write their own reflection that
comments on their individual experiences in completing the assignment.

The source code of the two Java file must also pass additional tests set by the
[GatorGrader tool](https://github.com/gkapfham/gatorgrader). GatorGrader will
check the following characteristics of your implementation:

* The `TodoListManager` program must:
  * Contain at least two multi-line comments
  * Use the `new` keyword at least two times
  * Create and use at least three `while` loops
  * Create and use at least one `if` statement
  * Declare and use at least two `Iterator<TodoListItem>` Iterators
  * Call the `println` method at least nine times
  * Use at least one `break` statement to exit a `while` loop
  * Call methods of the other provided classes as outlined in the assignment sheet

* The `TodoListItem` program must:
  * Contain at least nine multi-line comments
  * Declare at least six `private` instance variables
  * Provide well-described methods as outlined in the assignment sheet

* The `TodoList` program must:
  * Contain at least nine multi-line comments
  * Declare at least six `private` instance variables
  * Create and use at least five `while` loops
  * Create and use at least four `if` statements
  * Perform computations as outlined in the assignment sheet

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If both
your source code and writing meet all of the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also review Chapters 1 through 4 and
study Sections 5.1 through 5.6. Please see the course instructor or one of the
teaching assistants or tutors if you have questions about any of these reading
assignments.

## Commands

To get started in using the GatorGrader tool, you can change into the directory
for this assignment and type the command `./gatorgrader.sh --start` in your
terminal. Now, if you want to perform all of the checks that will automatically
evaluate your assignment, you can type the command `./gatorgrader.sh --check`.

Running this command will produce a lot of output that you should carefully
inspect. If the last line of the output indicates that GatorGrader judges that
there are no mistakes in the assignment, then this means that your source code
and writing are passing all of the automated checks. However, if the last line
of the output indicates that there are mistakes, then you will need to
understand what they are and then try to fix them.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are also additional commands that you can type:

* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main directory for this
assignment where the `build.gradle` file is located. Then, you can type the
command in the terminal and study the output. Please note that, since this
program interacts with the user in the terminal window, you must run it
differently than you ran past programs. Specifically, you should use the
following command to run the `TodoListManager`:

```
gradle -q --console plain run
```

If the course instructor publishes a new version of GatorGrader and asks you to
access it, then you need change into the tool's directory by typing `cd
gatorgrader`. Then, you can type the command `git pull` to download the new
source code for the GatorGrader tool. If this command completes successfully,
then you can return to the main directory for this laboratory assignment by
typing `cd ..` and then continuing your work.

## Output

Using the provided file, the `TodoListManager` should read in and display
numerical values. Next, the program will calculate and display the minimum,
maximum, and arithmetic mean of these values. Finally, the program will display
a closing message. A sample of the output that this program could produce is
provided below. Importantly, please ensure that you test your program with
different inputs than those that are provided in the file. What are some other
ways in which your team thinks that it would be a good idea to test this
program?

```
Welcome to the Todo List Manager.
What operation would you like to perform?
Available options:read, priority-search, category-search, done, list, quit
read
list
0, A, Understand, Draw diagram(s) to explain classes, done? false
1, A, Understand, Use the LJV to see TodoList, done? false
2, B, Explain, Add comments to all of the Todo classes, done? false
priority-search
What is the priority?
A
0, A, Understand, Draw diagram(s) to explain classes, done? false
1, A, Understand, Use the LJV to see TodoList, done? false
category-search
What is the category?
Explain
2, B, Explain, Add comments to all of the Todo classes, done? false
done
What is the identifier of the task?
0
list
0, A, Understand, Draw diagram(s) to explain classes, done? true
1, A, Understand, Use the LJV to see TodoList, done? false
2, B, Explain, Add comments to all of the Todo classes, done? false
quit
Thank you for using the Todo List Manager.
```

## Updates

If the course instructor updates the provided material for this assignment and
you would like to receive these updates, then you can type this command in the
main directory for this assignment:

```
./gatorgrader.sh --update git@github.com:Allegheny-Computer-Science-111-F2017/cs111-F2017-lab9-starter.git
```

You should only need to type this command once; typing the command additional
times may yield an error message but will not negatively influence the state of
your repository. Now, you are ready to download the updates provided by the
course instructor by typing:

```
./gatorgrader.sh --download
```

This second command can be run whenever the course instructor needs to provide
you with new source code for this assignment. However, please note that, if you
have edited the files that the course instructor updated, running the previous
command may lead to Git merge conflicts. If this happens, you may need to
manually resolve them with the help of the instructor or a teaching assistant.

## Travis

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
the checking programs every time you commit to your GitHub repository. The
checking will start as soon as you have accepted the assignment, thus creating
your own private repository, and the course instructor enables Travis for it. If
you are using Travis for the first time, you will need to authorize Travis CI to
access the private repositories that you created on GitHub.

## Requirements

The GatorGrader software that supports the checking of this assignment was
developed for the following software and versions:

* gradle 4.1
* java 1.8.0
* mdl 0.4.0
* proselint 0.7.0
* python 3.5.2

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 111 Lab 9
Starter](https://github.com/Allegheny-Computer-Science-111-F2017/cs111-F2017-lab9-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/gkapfham/gatorgrader) and the way that it checks you
assignment, then you can follow the aforementioned steps to create an issue in
its repository. To ensure that your issue is properly resolved, please provide
as many details as is possible about the problem that you experienced. If you
discover a problem with the laboratory assignment sheet, then please raise an
issue in the
[cs111-F2017-lab-sheets](https://github.com/Allegheny-Computer-Science-111-F2017/cs111-F2017-lab-sheets)
repository and mention this assignment.

Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
free laptop stickers and extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack team for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
