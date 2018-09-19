package hr.fer.zemris.java.hw07.shell;

import java.nio.file.Path;
import java.util.SortedMap;

import hr.fer.zemris.java.hw07.shell.commands.ShellCommand;

/**
 * This is an abstraction which will be passed to each defined command. The each
 * implemented command communicates with user (reads user input and writes
 * response) only through this interface.
 * 
 * @author Blaz Bagic
 * @version 1.0
 */
public interface Environment {

  /**
   * Reads a line from standard input.
   * 
   * @return a {@link String} input line
   * @throws ShellIOException
   *           in case of errors while reading
   */
  String readLine() throws ShellIOException;

  /**
   * Writes to the console.
   * 
   * @param text
   *          text to write
   * @throws ShellIOException
   *           in case of errors while writing to the standard output
   */
  void write(String text) throws ShellIOException;

  /**
   * Writes a line to the console.
   * 
   * @param text
   *          line to write
   * @throws ShellIOException
   *           in case of errors while writing to the standard output
   */
  void writeln(String text) throws ShellIOException;

  /**
   * Returns a sorted map of shell commands.
   * 
   * @return a Sorted map of shell commands.
   */
  SortedMap<String, ShellCommand> commands();

  /**
   * Returns a multiline symbol.
   * 
   * @return a multiline symbol.
   */
  Character getMultilineSymbol();

  /**
   * Sets the value of the multiline symbol.
   * 
   * @param symbol
   *          value to set
   */
  void setMultilineSymbol(Character symbol);

  /**
   * Returns the value of the prompt symbol.
   * 
   * @return the value of the prompt symbol
   */
  Character getPromptSymbol();

  /**
   * Sets the value of the prompt symbol.
   * 
   * @param symbol
   *          value to set
   */
  void setPromptSymbol(Character symbol);

  /**
   * Returns the value of the more-lines symbol
   * 
   * @return the value of the more-lines symbol
   */
  Character getMorelinesSymbol();

  /**
   * Sets the value of the more-lines symbol.
   * 
   * @param symbol
   *          value to set
   */
  void setMorelinesSymbol(Character symbol);

  /**
   * Returns an absolute path to the current working directory.
   * 
   * @return an absolute path to the current working directory
   */
  Path getCurrentDirectory();

  /**
   * Sets the current working directory to the value of the path parameter, if the
   * path exists on the user's file system.
   * 
   * @param path
   *          new working directory
   */
  void setCurrentDirectory(Path path);

  /**
   * Enables data sharing between different {@link ShellCommand} implementations.
   * 
   * @param key
   *          key for the requested data
   * @return the data under this key, if it exists
   */
  Object getSharedData(String key);

  /**
   * Adds or modifies the shared data under the specified key. The data is shared
   * between different {@link ShellCommand} implementations.
   * 
   * @param key
   *          key for the new data
   * @param value
   *          new data
   */
  void setSharedData(String key, Object value);

}