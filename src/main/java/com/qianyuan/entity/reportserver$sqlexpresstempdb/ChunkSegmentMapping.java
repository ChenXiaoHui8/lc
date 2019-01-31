package com.qianyuan.entity.reportserver$sqlexpresstempdb;


public class ChunkSegmentMapping {

  private String chunkId;
  private String segmentId;
  private long startByte;
  private long logicalByteCount;
  private long actualByteCount;


  public String getChunkId() {
    return chunkId;
  }

  public void setChunkId(String chunkId) {
    this.chunkId = chunkId;
  }


  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }


  public long getStartByte() {
    return startByte;
  }

  public void setStartByte(long startByte) {
    this.startByte = startByte;
  }


  public long getLogicalByteCount() {
    return logicalByteCount;
  }

  public void setLogicalByteCount(long logicalByteCount) {
    this.logicalByteCount = logicalByteCount;
  }


  public long getActualByteCount() {
    return actualByteCount;
  }

  public void setActualByteCount(long actualByteCount) {
    this.actualByteCount = actualByteCount;
  }

}
