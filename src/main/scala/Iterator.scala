trait Iterator {
  type T
  def hasNext: Boolean
  def next: T
}