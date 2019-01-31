package com.qianyuan.entity.reportserver$sqlexpress;


public class SegmentedChunk {

  private String chunkId;
  private String snapshotDataId;
  private long chunkFlags;
  private String chunkName;
  private long chunkType;
  private long version;
  private String mimeType;
  private long segmentedChunkId;


  public String getChunkId() {
    return chunkId;
  }

  public void setChunkId(String chunkId) {
    this.chunkId = chunkId;
  }


  public String getSnapshotDataId() {
    return snapshotDataId;
  }

  public void setSnapshotDataId(String snapshotDataId) {
    this.snapshotDataId = snapshotDataId;
  }


  public long getChunkFlags() {
    return chunkFlags;
  }

  public void setChunkFlags(long chunkFlags) {
    this.chunkFlags = chunkFlags;
  }


  public String getChunkName() {
    return chunkName;
  }

  public void setChunkName(String chunkName) {
    this.chunkName = chunkName;
  }


  public long getChunkType() {
    return chunkType;
  }

  public void setChunkType(long chunkType) {
    this.chunkType = chunkType;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }


  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public long getSegmentedChunkId() {
    return segmentedChunkId;
  }

  public void setSegmentedChunkId(long segmentedChunkId) {
    this.segmentedChunkId = segmentedChunkId;
  }

}
