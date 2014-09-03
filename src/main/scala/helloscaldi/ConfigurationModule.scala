package helloscaldi

import scaldi.Module

class ConfigurationModule extends Module {
  bind [Geocoder] to new GeocoderImpl
}
