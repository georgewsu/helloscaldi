package helloscaldi

trait Geocoder {

  def getCoordinates(location: String): Option[(Double, Double)]

}
