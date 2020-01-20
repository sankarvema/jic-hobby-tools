module.exports = {
  input: {
    source: 'D:/tem/My Web Sites/adminLte/hts-cache/something/input.txt'
  },
  fetch: {
    request: {
      header: {},
      redirect: {
        max: 10,
      }
    },
    domains: {
      blacklist: '',
      mapper: ''
    }
  },
  save: {
    path: '',
    preservePath: 'true',
    autoIncrement: 'true',
    fileTyes: '',
    image: {
      min: {
        width: 2000,
        height: 2000,
        size: 100000,
      }
    },
  },
}
