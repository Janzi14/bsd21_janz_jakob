# Exercise 5:

## Why are logging libraries being used?

Libraries like log4j make it relatively easy to configure logging to files
so it's simple to get feedback, without interfering with your code.

## What are the different log levels in log4j and why are they being used?

### DEBUG

This is for debugging the application.

### INFO

This is for providing progress information.

### WARN Level

It gives a warning about an event to the developer.

### ERROR

This level gives information about an error necessary to be solved.

### FATAL

Once you get here, your application has a severe problem.

### ALL

Here all levels are turned on.

### OFF

This turns off all the logging.

## What kinds of configurations are offered in log4j?

1. XML, JSON, YAML and properties format.
2. through creating a Configuration implementation.
3. when calling the APIs exposed in the Configuration interface.
4. Programmatically, by calling methods on the internal Logger class.

    [source](https://logging.apache.org/log4j/2.x/manual/configuration.html "source")
:)