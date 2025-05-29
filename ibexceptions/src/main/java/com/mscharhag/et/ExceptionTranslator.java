package com.mscharhag.et;

public interface ExceptionTranslator {

  void translate(TryBlock tryBlock);

  @Deprecated
  default void withTranslation(TryBlock tryBlock) {
    translate(tryBlock);
  }

  <T> T returns(ReturningTryBlock<T> invokable);

  @Deprecated
  default <T> T withReturningTranslation(ReturningTryBlock<T> invokable) {
    return returns(invokable);
  }

  /**
   * <p>This swallows any exceptions.  It should only be used with
   * specific circumstances, like closing an open resource where
   * you dont care if there's an error.</p>
   *
   * <p>Note that you pretty much always care if there's an error.</p>
   *
   * @param tryBlock
   */
  void swallow(TryBlock tryBlock);

  ExceptionTranslatorConfigurer newConfiguration();

}
