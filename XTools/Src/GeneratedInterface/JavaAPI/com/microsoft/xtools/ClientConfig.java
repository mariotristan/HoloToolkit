/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.xtools;

public class ClientConfig {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ClientConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClientConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        XToolsClientJNI.delete_ClientConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ClientConfig(ClientRole role) {
    this(XToolsClientJNI.new_ClientConfig(role.swigValue()), true);
  }

  public ClientRole GetRole() {
    return ClientRole.swigToEnum(XToolsClientJNI.ClientConfig_GetRole(swigCPtr, this));
  }

  public String GetServerAddress() {
    return XToolsClientJNI.ClientConfig_GetServerAddress(swigCPtr, this);
  }

  public boolean SetServerAddress(String serverAddress) {
    return XToolsClientJNI.ClientConfig_SetServerAddress(swigCPtr, this, serverAddress);
  }

  public int GetServerPort() {
    return XToolsClientJNI.ClientConfig_GetServerPort(swigCPtr, this);
  }

  public boolean SetServerPort(int port) {
    return XToolsClientJNI.ClientConfig_SetServerPort(swigCPtr, this, port);
  }

  public LogWriter GetLogWriter() {
    long cPtr = XToolsClientJNI.ClientConfig_GetLogWriter(swigCPtr, this);
    return (cPtr == 0) ? null : new LogWriter(cPtr, false);
  }

  public void SetLogWriter(LogWriter logger) {
    XToolsClientJNI.ClientConfig_SetLogWriter(swigCPtr, this, LogWriter.getCPtr(logger), logger);
  }

  public boolean GetIsAudioEndpoint() {
    return XToolsClientJNI.ClientConfig_GetIsAudioEndpoint(swigCPtr, this);
  }

  public void SetIsAudioEndpoint(boolean isAudioEndpoint) {
    XToolsClientJNI.ClientConfig_SetIsAudioEndpoint(swigCPtr, this, isAudioEndpoint);
  }

}