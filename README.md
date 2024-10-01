# linear-quadratic-equations
This repository contains implementations of first-degree and quadratic equation solvers in Scala, showcasing fundamental mathematical concepts.

Here's a markdown workflow for using sbt (Scala Build Tool) to create, compile, and run a Scala project:

```markdown
# sbt Workflow for Scala Projects

## 1. Install sbt

Make sure you have sbt installed. You can install it by following the instructions on the [sbt official website](https://www.scala-sbt.org/download.html).

## 2. Create a New sbt Project

1. **Create Project Directory**:
   ```bash
   mkdir MyScalaProject
   cd MyScalaProject
   ```

2. **Create build.sbt File**:
   Create a file named `build.sbt` in your project root directory with the following content:
   ```scala
   name := "MyScalaProject"

   version := "0.1"

   scalaVersion := "3.5.0"  // Set the desired Scala version
   ```

## 3. Create Source Directory Structure

1. **Create Directories**:
   ```bash
   mkdir -p src/main/scala
   ```

2. **Create Your Scala File**:
   Inside `src/main/scala`, create a Scala file (e.g., `Fibonacci.scala`):
   ```scala
   object Fibonacci {
     def main(args: Array[String]): Unit = {
       def fibonacci(n: Int): Int = {
         if (n <= 1) n
         else fibonacci(n - 1) + fibonacci(n - 2)
       }

       val count = 10
       for (i <- 0 until count) {
         print(fibonacci(i) + " ")
       }
     }
   }
   ```

## 4. Open sbt Shell

In your project root directory, run:
```bash
sbt
```

## 5. Compile the Project

Once in the sbt shell, compile your project by running:
```bash
> compile
```

## 6. Run the Project

To run your application, use:
```bash
> run
```

## 7. Additional sbt Commands

- **Clean the Project**: Remove generated files.
  ```bash
  > clean
  ```

- **Show Project Dependencies**:
  ```bash
  > show dependencies
  ```

- **Exit sbt Shell**:
  ```bash
  > exit
  ```

## 8. Updating Scala Version

To change the Scala version:

1. Modify the `scalaVersion` in `build.sbt`.
2. In the sbt shell, run:
   ```bash
   > reload
   > update
   ```

3. Compile and run again:
   ```bash
   > compile
   > run
   ```

## Conclusion

This workflow provides a structured approach to developing Scala projects using sbt, from project setup to compilation and execution.
```

This markdown document provides a step-by-step guide to using sbt for your Scala projects, including creating a project, compiling, running, and managing dependencies. You can modify the content to suit your needs!

#### References:
https://docs.scala-lang.org/
