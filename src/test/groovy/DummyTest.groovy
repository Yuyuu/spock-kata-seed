import spock.lang.Specification

class DummyTest extends Specification {

  def "everything should be fine"() {
    expect:
    1 + 1 == 2
  }
}
